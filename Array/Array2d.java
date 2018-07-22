class Array{

}
class Array2d {

	public static void main(String []args){
		int p[][]=new int[3][4];
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				if(i%2==0) p[i][j]=i;
				else p[i][j]=j;
			}
		}
		/*for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++){
				System.out.print(p[i][j]);
			}
			System.out.println(" ");
		}*/
		for(int i[]:p){
			for(int j:i){
				System.out.print(j +" ");
			}
			System.out.println("");
		}

	}



}