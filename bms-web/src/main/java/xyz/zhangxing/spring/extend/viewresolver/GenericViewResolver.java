package xyz.zhangxing.spring.extend.viewresolver;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.util.WebUtils;
import xyz.zhangxing.spring.extend.view.GenericView;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

public class GenericViewResolver extends UrlBasedViewResolver  {

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        return super.resolveViewName(viewName, locale);
    }


    @Override
    protected AbstractUrlBasedView buildView(String viewName) throws Exception {
        GenericView view=new GenericView();
        view.setUrl(getPrefix()+viewName+getSuffix());
        return view;
    }

    @Override
    protected Class<?> requiredViewClass() {
        return GenericView.class;
    }

    @Override
    protected Class<?> getViewClass() {
        return super.getViewClass()==null?requiredViewClass():super.getViewClass();
    }
}
