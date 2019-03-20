package pack2;

public class Punjabi extends LanguageTranslator{
	
	private String competence; 
	
	public Punjabi (Developer bt){
		super(bt);  // this.bt=bt;	 
		this.competence="punjabi";
	}
	
	@Override
	public String getCompetence(){
		return this.competence+ ", "+bt.getCompetence();
	}	
	@Override
	public String detailCompetence(Language l){
		if (l==Language.punjabi){
			return "Specific details of "+ l.toString()+".";
		}
		else {
			return bt.detailCompetence(l);
		}
			
	}


}
