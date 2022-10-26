package me.smartsore.project.groups;

// 스마트스토어 총 이용시간과 결제금액에 따라 고객을 세 그룹으로 분류
public class Group {
    private Group groupType;  // general, vip, vvip
    private int spentTime;
    private int totalPay;

    public Group(Group groupType, int spentTime, int totalPay) {
        this.groupType = groupType'
        this.spentTime = spentTime;
        this.totalPay = totalPay;
    }

    public Group getGroupType() {
        return groupType;
    }

    public void setGroupType(Group groupType) {
        this.groupType = groupType;
    }

    public int getSpentTime() {
        return spentTime;
    }

    public void setSpentTime(int spentTime) {
        this.spentTime = spentTime;
    }

    public int getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(int totalPay) {
        this.totalPay = totalPay;
    }

    @Override
    public String tostring() {
        return "Group{" +
                "groupType = " + groupType +
                ", spentTime = " + spentTime +
                ", totalPay = " + totalPay + "}";
    }
}
