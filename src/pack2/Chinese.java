package pack2;

public class Chinese extends LanguageTranslator{
	private String competence; 
	
	public Chinese (Developer bt){
		super(bt);  // this.bt=bt;	
		this.competence="chinese";
	}
	
	@Override
	public String getCompetence(){
		return this.competence+ ", "+bt.getCompetence();
	}	
	@Override
	public String detailCompetence(Language l){
		if (l==Language.chinese){
			return "Specific details of "+ l.toString()+".";
		}
		else {
			return bt.detailCompetence(l);
		}
			
	}

}