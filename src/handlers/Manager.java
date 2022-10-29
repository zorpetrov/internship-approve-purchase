package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code
 */
public class Manager extends Approver {
    private OutputGenerator oGen = new OutputGenerator();
    private ApprovalGenerator aGen = new ApprovalGenerator();
    
    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(cost, type)) {
            oGen.purchApproved(this, id, cost);
            return;
        }
        oGen.purchGoHigher(this, id, cost);
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(double cost, Type type) {
        return aGen.approvalGen(this, cost, type);
    }
}
