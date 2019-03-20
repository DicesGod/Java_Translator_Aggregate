package pack2;

public class Persian extends LanguageTranslator{
	private String competence; 
	
	public Persian (Developer bt){
		super(bt);  // this.bt=bt;	
		this.competence="persian";
	}
	@Override
	public String getCompetence(){
		return this.competence+ ", "+bt.getCompetence();
	}	
	@Override
	public String detailCompetence(Language l){
		if (l==Language.persian){
			return "Specific details of "+ l.toString()+".";
		}
		else {
			return bt.detailCompetence(l);
		}
			
	}
	

}