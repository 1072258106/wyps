package org.wyjc.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.wyjc.entity.Commend;
import org.wyjc.util.JsonUtil;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户管理
 * 
 * @author chenying
 * 
 */
public class StockAction extends ActionSupport {
	private String resultStr;

	public String getResultStr() {
		return resultStr;
	}

	public void setResultStr(String resultStr) {
		this.resultStr = resultStr;
	}

	public String commendList() {
		List<Commend> commendList = new ArrayList<Commend>();
		Commend commend = new Commend();
		commend.setId(1);
		commend.setTitle("�����ȵ�");
		commend.setDescription("���������ȵ�ɷ����޹�˾ǰ��Ϊԭ���������ɷ����޹�˾��������Ϊ������������ů��˾�����Ҵ��Ͷ�����ҵ��������1980��5��22");
		commendList.add(commend);
		commend = new Commend();
		commend.setId(1);
		commend.setTitle("�����ȵ�");
		commend.setDescription("���������ȵ�ɷ����޹�˾ǰ��Ϊԭ���������ɷ����޹�˾��������Ϊ������������ů��˾�����Ҵ��Ͷ�����ҵ��������1980��5��22");
		commendList.add(commend);
		commend = new Commend();
		commend.setId(1);
		commend.setTitle("�����ȵ�");
		commend.setDescription("���������ȵ�ɷ����޹�˾ǰ��Ϊԭ���������ɷ����޹�˾��������Ϊ������������ů��˾�����Ҵ��Ͷ�����ҵ��������1980��5��22");
		commendList.add(commend);
		commend = new Commend();
		commend.setId(1);
		commend.setTitle("�����ȵ�");
		commend.setDescription("���������ȵ�ɷ����޹�˾ǰ��Ϊԭ���������ɷ����޹�˾��������Ϊ������������ů��˾�����Ҵ��Ͷ�����ҵ��������1980��5��22");
		commendList.add(commend);
		Map m = new HashMap();
		m.put("list", commendList);
		this.resultStr = JsonUtil.returnDefaultAjax(m);
		return "json";
	}
}
