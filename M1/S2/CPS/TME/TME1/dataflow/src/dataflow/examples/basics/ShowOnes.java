package dataflow.examples.basics;

import dataflow.core.Printer;
import dataflow.generators.GenConst;

public class ShowOnes {

	public static void main(String[] args) {
		int nb_gen = 30;
		if (args.length > 0) {
			try {
				nb_gen = Integer.parseInt(args[0]);
			} catch(NumberFormatException e) { /* ok use default */ }
		}

		GenConst gen = new GenConst(1);
		Printer printer = new Printer("ones() -> ");
		
		gen.bindIntEventReceiverService(printer);
				
		
		for(int i = 0; i < nb_gen; i++) {
			gen.activate();
			printer.activate();
		}
		
	}

}
