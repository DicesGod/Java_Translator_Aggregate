package pack2;

public class Portuguese extends LanguageTranslator{
	private String competence; 
	
	public Portuguese (Developer bt){
		super(bt);  // this.bt=bt;	
		this.competence="portuguese";
	}
	
	@Override
	public String getCompetence(){
		return this.competence+ ", "+bt.getCompetence();
	}
	@Override
	public String detailCompetence(Language l){
		if (l==Language.portuguese){
			return "Specific details of "+ l.toString()+".";
		}
		else {
			return bt.detailCompetence(l);
		}
			
	}

}
