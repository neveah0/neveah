public class Demo{ 
	
	public static void main(String[] args) {
		
				int[] arr=new int[]{18,25,7,36,13,2,89,63};
				int max=arr[0];
				int count1=0;
				for(int i=0;i<arr.length;i++){
					if(max<arr[i]){
						max=arr[i];
					}	
					count1++;
				}
				int count2=count1-1;
				System.out.println("最大的数："+max);
				System.out.println("下标："+count2);
			}
}