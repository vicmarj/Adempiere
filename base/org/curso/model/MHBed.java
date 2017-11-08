package org.curso.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.adempiere.exceptions.AdempiereException;

public class MHBed extends X_H_Bed {

	public MHBed(Properties ctx, int H_Bed_ID, String trxName) {
		super(ctx, H_Bed_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MHBed(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.compiere.model.PO#saveEx()
	 */
}
