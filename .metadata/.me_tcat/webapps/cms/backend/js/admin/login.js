function form_submit(){
	document.getElementById("login").submit();
}
function form_reset(){
	document.getElementById("login").reset();
}
function reloadcode(){
    var verify=document.getElementById('safecode');
    verify.setAttribute('src','code.jsp?'+Math.random());
}

/*
 * У����֤��
 */
function validateVerifyCode() {
	var bool = true;
	$("#verifyCodeError").css("display", "none");
	var value = $("#verifyCode").val();
	if(!value) {//�ǿ�У��
		$("#verifyCodeError").css("display", "");
		$("#verifyCodeError").text("��֤�벻��Ϊ�գ�");
		bool = false;
	} else if(value.length != 4) {//���Ȳ�Ϊ4���Ǵ����
		$("#verifyCodeError").css("display", "");
		$("#verifyCodeError").text("�������֤�룡");
		bool = false;
	} else {//��֤���Ƿ���ȷ
		$.ajax({
			cache: false,
			async: false,
			type: "POST",
			dataType: "json",
			data: {method: "ajaxValidateVerifyCode", verifyCode: value},
			url: "/UserServlet",
			success: function(flag) {
				if(!flag) {
					$("#verifyCodeError").css("display", "");
					$("#verifyCodeError").text("�������֤�룡");
					bool = false;					
				}
			}
		});
	}
	return bool;
}

function _hyz() {
	$("#vCode").attr("src", "/cms/VerifyCodeServlet?" + new Date().getTime());
}