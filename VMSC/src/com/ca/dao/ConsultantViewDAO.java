package com.ca.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.ca.connectdb.ConnectDb;

public class ConsultantViewDAO {
	
	public JSONObject JSONDAO() {
		Statement st=null;
		ConnectDb dbCon= new ConnectDb();
		Connection conn=dbCon.dbConnection();
		ResultSet rs=null;
		JSONArray _arr=new JSONArray();
		JSONObject _obj=new JSONObject();
		String Query= "select * from `vms`.`consultant`"; 
		try {
			st=conn.createStatement();
			rs=st.executeQuery(Query);
			int i=0;
			JSONObject item=null;
			while(rs.next()) {
				item = new JSONObject();
				item.put("idfromdb",rs.getInt(1));
				System.out.println("ID"+rs.getInt(1));
				item.put("cfname",rs.getString(2));
				System.out.println("name:"+rs.getString(2));
				_arr.add(item);
				i++;
			}
			_obj.put("total",i);
			_obj.put("rows",_arr);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return _obj;
	}

}
