
public class Product {
	
	
	private double price;	
	private double size;	
	private int num;	
	private String name;	
	private String confi;
	private String type;
	
	
	public Product(double price,double size,int num,String name,String confi,String type) {
		this.price=price;
		this.size=size;
		this.num=num;
		this.name=name;
		this.confi=confi;
	    this.type=type;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Product product1=new Product(5199,2160,20,"matebook","5GSoC芯片","i5-8500");
     Product product2=new Product(7988,2160,23,"Kurui","8G KH-B75A","i7-8700");
     Product product3=new Product(5988,2160,50,"Magicbook","16G","Nbl-WAQ9HNL");
     int allnum;
     allnum=product1.num+product2.num +product3.num;
     double allprice;
     allprice=product1.price+product2.price+product3.price;
      System.out.println("商品名         价格       数量     尺寸                配置        型号");
      System.out.println(product1.name+"   "+product1.price+"   "+product1.num+"   "+product1.size+"   "+product1.confi +"    "+product1.type);
      System.out.println(product2.name+"      "+product2.price+"   "+product2.num+"   "+product2.size+"   "+product2.confi +"  "+product2.type);
      System.out.println(product3.name+"  "+product3.price+"   "+product3.num+"   "+product3.size+"        "+product3.confi +"     "+product3.type);
	  System.out.println("汇总");
	  System.out.println("库存："+allnum);
	  System.out.println("总金额："+allprice);
	
	
	
	}
}