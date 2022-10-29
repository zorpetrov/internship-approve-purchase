package handlers;

import common.Type;

public abstract class Approver {

    protected Approver next;

    /**
     * If needed, be free to change signature of abstract methods.
     */
    public abstract void approve(int id, double cost, Type type);
    
    /**Id is not a relevant information for approval of purchase, so I removed it from the signature of canApprove method */
    protected abstract boolean canApprove(double cost, Type type);

    /**
     * Method used for registering next approver level.
     * DO NOT CHANGE IT.
     */
    public Approver registerNext(Approver next) {
        this.next = next;
        return next;
    }
}
