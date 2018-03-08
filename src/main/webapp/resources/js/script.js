$("#btn-pesquisar").click(pesquisar);
	

function pesquisar(){
    var cidade={
         Nome:$('#cidade').val(),
		 Estado:$('#estado').val()
	}
    
    if(validarCampos(cidade)){
    
		$.ajax({
			type:"post",
		    contentType: "application/json; charset=utf-8",
			url:"cidade/pesquisar",
			data:JSON.stringify(cidade),
			beforeSend: function() {
				$("#spinner").show(); 
		    },
			success:function(response){
			  $('#result').html(response);	
			},
	    }).fail(function(error){
	    	 showMensagem('Ocorreu uma falha durante a operação. Tente novamente mais tarde.');
	         console.log(error);
	         $("#spinner").hide(); 
	    }).done(function(){
	    	$("#spinner").hide();   
	    }) 
    }   
}   
 

function pontos(id){
    var cidade={
	         Nome:$('#cidade'+id).text(),
			 Estado:$('#estado'+id).text()
	}
 	$.ajax({
		type:"post",
	    contentType: "application/json; charset=utf-8",
		url:"cidade/pontos",
		data:JSON.stringify(cidade),
		beforeSend: function() {
			$("#spinner").show();  
	    },
		success:function(response){
		  showMensagem('A pontuação da cidade '+cidade.Nome+' é: '+response);
		},
    }).fail(function(error){
    	 showMensagem('Ocorreu uma falha durante a operação. Tente novamente mais tarde');
         console.log(error);
         $("#spinner").hide();  
    }).done(function(){
    	$("#spinner").hide();   
    }) 
}   


function validarCampos(cidade){
	if(cidade.Nome==''){
    	showMensagem('O Campo Cidade é obrigatório');
    	return false;
    }
    
    if(cidade.Estado==''){
    	showMensagem('O Campo Estado é obrigatório');
    	return false;
    }
    
    return true;
}

function showMensagem(mensagem){
	$.fn.jAlert({
		'title': 'Atencao',
		'iframeHeight': '300px',
		'content': mensagem,
		'theme':'green'
	});
}




