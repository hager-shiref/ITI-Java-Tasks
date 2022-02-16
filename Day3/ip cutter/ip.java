class IpCutter{
	public static void main(String [] args){
		String [] arg  = args[0].split("\\.");
		/*for(int i=0; i<arg.length;i++){
			System.out.println(arg[i]);
		}*/
			 
			
			endIndex=arg[0].indexOf(dot,startIndex);
			System.out.println(endIndex);
			for(int i=0; i<args[0].length();i++){
				
				int index=args[0].indexOf(".",i);
				
				i+=index;
				
				
				
			}
			
			
			
	}

}

