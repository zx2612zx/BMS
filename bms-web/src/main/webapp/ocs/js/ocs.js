$.extend({
    heredoc: function (func) {
        return func.toString().split('\n').slice(1, -1).join('\n') + '\n'
    }
});

$.fn.footer = function () {
    var footerHtml = function () { /**
     <div class="ocs-ft-body ">
     <div>
     <div class="ocs-ft-content">
     <a href="" target="_blank" class="foot ocs-ft-lk">关于书城</a>
     <a href="" target="_blank" class="foot ocs-ft-lk">帮助中心</a>
     <a href="" target="_blank" class="foot ocs-ft-lk">开放平台</a>
     <a href="" target="_blank" class="foot ocs-ft-lk">联系我们</a>
     <a href="" target="_blank" class="foot ocs-ft-lk">合作平台</a>
     </div>
     <div class="ocs-ft-b">
     <a href="" target="_blank" class="foot ocs-ft-lk">关联平台</a>
     <a href="" target="_blank" class="foot ocs-ft-lk">阿里巴巴</a>
     <a href="" target="_blank" class="foot ocs-ft-lk">天猫购物</a>
     <a href="" target="_blank" class="foot ocs-ft-lk">淘宝平台</a>
     <a href="" target="_blank" class="foot ocs-ft-lk">京东商城</a>
     <a href="" target="_blank" class="foot ocs-ft-lk">苏宁易购</a>
     <a href="" target="_blank" class="foot ocs-ft-lk">国美商城</a>
     </div>
     <div class="ocs-ft-text ocs-ft-b">
     <a>增值电信业务经营许可证： 浙B2-20110446</a>
     <a> 网络文化经营许可证：浙网文[2015]0295-065号</a>
     <a>12318举报</a>
     <a>互联网药品信息服务资质证书编号：浙-（经营性）-2017-0005 </a>
     <a> 浙公网安备 33010002000120号</a>
     <a> © 2003-2017 TMALL.COM 版权所有</a>
     </div>
     </div>
     </div>
     */ }.toString();
    console.log($.heredoc(footerHtml))
    $(this).append($.heredoc(footerHtml));
}