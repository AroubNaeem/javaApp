import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller {
	 
		private  Model model;
		private view vv;
		
		
		public controller( Model model,view vv){
			this.model=model;
			this.vv=vv;
			
			this.vv.addAdditionListener(new addlistener());
			
			
			
		}
		class addlistener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				int firstnum ,secnum =0;
				try{
					
					firstnum= vv.getf();

					secnum= vv.gets();

					model.addnum(firstnum, secnum);
					
					vv.setr(model.getaddition());
				}
				catch(NumberFormatException e ){
					
					vv.errorm("you have to enters two integers only !!");
				}
				
			}}
}
