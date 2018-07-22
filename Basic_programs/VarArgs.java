class Display{
	void show(int ... a){
		for(int i:a){
			System.out.println(i);
		}
	}
}
class VarArgs{
	public static void main(String []args){
		Display d=new Display();
		d.show(12,45,23,55);

	}

}