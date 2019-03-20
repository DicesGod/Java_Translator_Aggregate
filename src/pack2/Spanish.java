package pack2;

public class Spanish extends LanguageTranslator{
	
	private String competence; 
	
	public Spanish (Developer bt){
		super(bt);  // this.bt=bt;	
		this.competence="spanish";
	}
	
	@Override
	public String getCompetence(){
		return this.competence+ ", "+bt.getCompetence();
	}	
	@Override
	public String detailCompetence(Language l){
		if (l==Language.spanish){
			return "Specific details of "+ l.toString()+".";
		}
		else {
			return bt.detailCompetence(l);
		}
			
	}
}
