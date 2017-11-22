package br.padrao.chainOfResponsability;

import com.sun.prism.Image;

public class FilterOp {

	private FilterOp nextOp;

	public FilterOp nextOp(FilterOp o) {
		this.nextOp = o;
		return o;
	}

	public void apply(Image img) {
		op(img);
		this.nextOp.apply(img);
	}

	public abstract void op(Image i);
	
}
