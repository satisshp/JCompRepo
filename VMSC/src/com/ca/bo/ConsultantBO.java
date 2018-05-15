package com.ca.bo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.ca.dao.ConsultantViewDAO;

public class ConsultantBO {
	
	public JSONObject viewConsultant(){
		ConsultantViewDAO viewdaoobj=new ConsultantViewDAO();
		JSONObject jsonobj=viewdaoobj.JSONDAO();
		return jsonobj;
		
	}

}
