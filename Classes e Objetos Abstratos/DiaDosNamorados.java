public class DiaDosNamorados extends CartaoWeb{

    public DiaDosNamorados(String destinatario){
		
		super(destinatario);
		
	}
	
	@Override
	public String showMessage(){
		
		return "Feliz dia dos Namorados "+ getDestinatario();
	
	}
}
