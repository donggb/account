/**
 * 60秒
 */
    
     	var InterValObj; //timer变量，控制时间
        var count = 60; //间隔函数，1秒执行
        var curCount;//当前剩余秒数
        function sendMessage() {
            curCount = count;
            var phone=$("#phone").val();
            //设置button效果，开始计时
            $("#getCode").attr("disabled", "true");
            $("#getCode").val("请在" + curCount + "秒内输入验证码");
            InterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次
           }
        //timer处理函数
        function SetRemainTime() {
            if (curCount == 0) {
                window.clearInterval(InterValObj);//停止计时器
                $("#getCode").removeAttr("disabled");//启用按钮
                $("#getCode").val("重新发送验证码");
            }
            else {
                curCount--;
                $("#getCode").val("请在" + curCount + "秒内输入验证码");
            }
        }
