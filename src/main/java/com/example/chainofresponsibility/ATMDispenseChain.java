package com.example.chainofresponsibility;

public class ATMDispenseChain {
    private DispenseChain chain;

    public ATMDispenseChain(){
        // initialize the chain
        this.chain = new Dollar50Dispenser();
        DispenseChain c1 = new Dollar20Dispenser();
        DispenseChain c2 = new Dollar10Dispenser();

        // set the chain of responsibility
        this.chain.setNextChain(c1);
        c1.setNextChain(c2);
    }

    public DispenseChain getChain(){
        return this.chain;
    }
}
