package data.extraction;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

public class Test {
	
	public static void main(String[] args) {
		try {
			Mongo m2 = new Mongo("133.133.133.122", 27017);
			DB db = m2.getDB("yourdb");
			DBCollection dbc = db.getCollection("things");
			DBObject o = new BasicDBObject();//创建一个对象
			o.put("name", "iteye");//添加一个键值对
			o.put("myname", "xiao9");//再添加一个键值对
			dbc.insert(o);//插入数据
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
