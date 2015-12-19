package ch.makery.address.model;

import org.apache.poi.ss.formula.functions.FinanceLib;

import base.RateDAL;
import domain.RateDomainModel;

public class Rate extends RateDomainModel {
	
	

	

	public static double getPayment(int NumberOfPayments,double PV,double term,double GivenCreditScore,double income, double Expenses)
	{
		double InterestRate=RateDAL.getRate(GivenCreditScore);
		double FV=0;
		double PMT;
		boolean Compounding = true;
		double Mortgage1;
		double Mortgage2;
		
		
		
		
		
		
		//	Figure out payment based on:
		//	Interest rate
		//	PV
		//	FV (make FV = 0, unless you want a balloon payment
		//	Compounding = True
		//	Number of Payments (passed in)
		
		
		PMT = FinanceLib.pmt(InterestRate, term, PV, FV, Compounding);
		
		Mortgage1 = income *0.36; 
		Mortgage2 = (income + Expenses)*0.28;
		
		if (Mortgage1>=PMT && Mortgage2>=PMT){
		 return PMT;
		}
		return PMT;
	}
	
}
