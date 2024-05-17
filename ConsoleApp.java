public class ConsoleApp {
	public static void main(String[] args) {
		String symbol = "*";
		
		int widht = 10;
		int height = 5;
		
		 if (args.length > 0) {
            for (int i = 0; i < args.length; i += 2) {
                // в чётных элементах массива находятся названия аргументов, в нечётных — значения
                String key = args[i];
                String value = args[i + 1];

                if (key.equals("--width")) {
                    width = Integer.parseInt(value);
                } else if (key.equals("--height")) {
                    height = Integer.parseInt(value);
                }
            }
        }
		
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= widht; j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
	}
}