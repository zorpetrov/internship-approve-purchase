package handlers;

import common.Type;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver{
    public OutputGenerator oGen = new OutputGenerator();
    public ApprovalGenerator aGen = new ApprovalGenerator();
    
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
