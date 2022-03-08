function request(type,url,param){
    console.log(param);
    $.ajax({
        type: type,
        url: url,
        data: param,
        dataType:"json",
        headers: {'Content-Type':'application/json;charset=utf8'},
        success: function (data){
            console.log(data);
            // if (data.error_code!==200){
            //     showToast(data.error_message);
            // }else {
            //     return data;
            // }
        }
    })
}

function showToast(msg,duration){
    duration=isNaN(duration)?3000:duration;
    var m = document.createElement('div');
    m.innerHTML = msg;
    m.style.cssText="width:10%; min-width:60px; background:#FF2D2D; opacity:0.6; height:auto;min-height: 40px; color:#fff; line-height:30px; text-align:center; border-radius:4px; position:fixed; top:0%; left:50%; z-index:999999;";
    document.body.appendChild(m);
    setTimeout(function() {
        var d = 0.5;
        m.style.webkitTransition = '-webkit-transform ' + d + 's ease-in, opacity ' + d + 's ease-in';
        m.style.opacity = '0';
        setTimeout(function() { document.body.removeChild(m) }, d * 1000);
    }, duration);
}


function sendGet(){
    let url = "/apiSvc/api/v1/api-detail";
    let request = new XMLHttpRequest();
    request.open("POST",url);
    let param = {};
    let apiId = document.getElementById("baseId").value;
    console.log(apiId);
    param.data = apiId;
    request.onload = function (){
        if (request.status === 200){
            console.log("success")
            let result = request.responseText;
            console.log(result);
            let apiNameDoc = document.getElementById("apiName");
            let response = JSON.parse(result);
            if (response.error_code!==200){
                showToast(response.error_message);
            }else {
                let s = response.data.apiName;
                apiNameDoc.setAttribute("value",s);
            }
        }
    };
    request.setRequestHeader("Content-Type","application/json;charset=utf-8")
    request.send(JSON.stringify(param));
}