$(function(){
	
	
	//resolve Active menu
	switch(menu){
	
	case 'About':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'View Products':
		$('#listProducts').addClass('active');
		break;
	default:
		$('#home').addClass('active');
		break;
		
		
	
	}
	
	
	
});