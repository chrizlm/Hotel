package com.example.hotelSB.model;

public class ReserveService 
{


	public String reserveSystem(int numPpl, int numHrs) {

		int rando = (int) (Math.random()*1000000);
		
		switch(numHrs) {
		case 1:
			switch(numPpl) {
			case 1:
				return "reserved table 10 for one from 6pm - 7pm \n"
						+ "ticket number: "+rando+"\n"
						+"Enjoy your meal ";
				
			case 2:
				return "reserved table 11 for one from 6pm - 7pm \n"
				+ "ticket number: "+rando+"\n"
				+"Enjoy your meal ";
				
			case 3:
				return "reserved table 12 for one from 6pm - 7pm \n"
				+ "ticket number: "+rando+"\n"
				+"Enjoy your meal ";
				
			case 4:
				return "reserved table 13 for one from 6pm - 7pm \n"
				+ "ticket number: "+rando+"\n"
				+"Enjoy your meal ";
				
			default:
				return "We are sorry currently we offer a maximum reservation for four people";
			}
			
		case 2:
			switch(numPpl) {
			case 1:
				return "reserved table 10 for one from 7pm - 8pm \n"
						+ "ticket number: "+rando+"\n"
						+"Enjoy your meal ";
				
			case 2:
				return "reserved table 11 for one from 7pm - 8pm \n"
				+ "ticket number: "+rando+"\n"
				+"Enjoy your meal ";
				
			case 3:
				return "reserved table 12 for one from 7pm - 8pm \n"
				+ "ticket number: "+rando+"\n"
				+"Enjoy your meal ";
				
			case 4:
				return "reserved table 13 for one from 7pm - 8pm \n"
				+ "ticket number: "+rando+"\n"
				+"Enjoy your meal ";
				
			default:
				return "We are sorry currently we offer a maximum reservation for four people";
			}
			
			
		case 3:
			switch(numPpl) {
			case 1:
				return "reserved table 10 for one from 8pm - 9pm \n"
						+ "ticket number: "+rando+"\n"
						+"Enjoy your meal ";
				
			case 2:
				return "reserved table 11 for one from 8pm - 9pm \n"
				+ "ticket number: "+rando+"\n"
				+"Enjoy your meal ";
				
			case 3:
				return "reserved table 12 for one from 8pm - 9pm \n"
				+ "ticket number: "+rando+"\n"
				+"Enjoy your meal ";
				
			case 4:
				return "reserved table 13 for one from 8pm - 9pm \n"
				+ "ticket number: "+rando+"\n"
				+"Enjoy your meal ";
				
			default:
				return "We are sorry currently we offer a maximum reservation for four people";
			}
			
		default:
			return "thank you";
		}
			
	}
}
