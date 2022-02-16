class Calculator{
	public static void main(String [] args){
		if(args.length >2){
				if(args.length <4 ){
			double num1 = Integer.parseInt(args[0]);
			double num2 = Integer.parseInt(args[2]);
				String operator=args[1];
				if(operator.length() <=1){
					switch(operator){
				case "+":
				double add = num1 + num2;
				System.out.println("Sum is " + add);
				break;
				case "-":
				 double sub=num1 - num2;
				 System.out.println("Subtraction is " + sub);
				 break;
				 case "x":
				 double multiple=num1 * num2;
				 System.out.println("Multiplication is " + multiple);
				 break;
				 case "/":
				 double div= num1 / num2;
				 if(num2==0 && num1 >=1){
					 System.out.println("Division is  infinity " );
				 }
				 if(num2 ==0 && num1 <0){
					  System.out.println("Division is  negative Infinity " );
				 }
				 if(num1==0 && num2==0){
					  System.out.println("Nan " );
				 }
				 if(num1>=0 && num2 >=1){
					 System.out.println("Division is " + div);
				 }
				 break;
				 
				}}
				else{
					System.out.println("Wrong Operator");
				}
				
			}
		}
		
		else {
			System.out.println("Can't be calculate more or less than 2 numbers ");
		}
	}	
}
