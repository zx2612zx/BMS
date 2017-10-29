package xyz.zhangxing.spring.extend.view;

import org.apache.commons.io.IOUtils;
import org.springframework.web.servlet.view.AbstractUrlBasedView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.Map;

/**
 * 通用的视图,仅仅将资源文件输出到HttpServletResponse
 * @author zx
 * @since 2017/10/29
 */
public class GenericView extends AbstractUrlBasedView {



    public GenericView( ){
    }

    protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        InputStream  in=getApplicationContext().getResource(getViewPath(request)).getInputStream();
        IOUtils.copy(in,response.getWriter());
    }

    public String getViewPath(HttpServletRequest request){
        return getUrl();
    }
}
;