package study190304;

public class OrderBoardVO {
	private Integer orderNum;
	private String buyer;
	private String buyAdr;
	private String reqName;
	private Integer reqCnt;
	private String reqDat;
	private String reqTim;
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getBuyAdr() {
		return buyAdr;
	}
	public void setBuyAdr(String buyAdr) {
		this.buyAdr = buyAdr;
	}
	public String getReqName() {
		return reqName;
	}
	public void setReqName(String reqName) {
		this.reqName = reqName;
	}
	public Integer getReqCnt() {
		return reqCnt;
	}
	public void setReqCnt(Integer reqCnt) {
		this.reqCnt = reqCnt;
	}
	public String getReqDat() {
		return reqDat;
	}
	public void setReqDat(String reqDat) {
		this.reqDat = reqDat;
	}
	public String getReqTim() {
		return reqTim;
	}
	public void setReqTim(String reqTim) {
		this.reqTim = reqTim;
	}
	@Override
	public String toString() {
		return "OrderBoardVO [orderNum=" + orderNum + ", buyer=" + buyer + ", buyAdr=" + buyAdr + ", reqName=" + reqName
				+ ", reqCnt=" + reqCnt + ", reqDat=" + reqDat + ", reqTim=" + reqTim + "]";
	}

}
