

public class mvccalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  view vv=new view();
  Model model=new Model();
  controller c= new controller(model,vv);
  vv.setVisible(true);
	
	}
}
