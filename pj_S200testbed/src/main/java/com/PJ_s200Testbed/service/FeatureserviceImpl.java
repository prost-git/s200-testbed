package com.PJ_s200Testbed.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PJ_s200Testbed.domain.FeatureDTO;
import com.PJ_s200Testbed.model.Attribute;
import com.PJ_s200Testbed.model.DataSet;
import com.PJ_s200Testbed.persistence.FeatureDAO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FeatureserviceImpl implements Featureservie {

	@Autowired // DB사용
	private SqlSession sqlSession;
	
	FeatureDAO fDao;
	
	@Autowired
	public void TestDAO() {
		fDao = sqlSession.getMapper(FeatureDAO.class);
	}
	
	@Override
	public int countArticle(int num, String keyword) {
		Map<String, Object> map = new HashMap<>();
		map.put("num", num);
		map.put("keyword", keyword);
		return fDao.countArticle(map);
	}
	
	@Override
	public List<FeatureDTO> featureselect(int num, String keyword, int start, int end) {
		Map<String, Object> map = new HashMap<>();
		map.put("num", num);
		map.put("keyword", keyword);
		map.put("start", start);
		map.put("end", end);
		return fDao.featureselect(map);
	}


	@Override
	public List<FeatureDTO> featuresearch(int num, int featureid) {
		Map<String, Object> map = new HashMap<>();
		map.put("num", num);
		map.put("featureid", featureid);
		return fDao.featuresearch(map);
	}
	@Override
	public List<FeatureDTO> featureDetail(int featureid) {
		return fDao.featureDetail(featureid);
	}

	@Override
	public void featureDelete(List<Integer> featureDelArray) {
		
		log.info("서비스 ");
		fDao.featureDelete(featureDelArray);
	}

	@Override
	public void DeatilUpdate(String value, int FeaturePk) {
		Map<String, Object> map = new HashMap<>();
		map.put("value", value);
		map.put("FeaturePk", FeaturePk);
	   fDao.DeatilUpdate(map);
	}
	
	@Override
	public DataSet selectDataset(int featureID) {
		return fDao.selectDataset(featureID);
	}
	
	@Override
	public Attribute selectAttribute(int attributeID) {
		return fDao.selectAttribute(attributeID);
	}

	public List<Integer> selectAssociation(int featureid){
		return fDao.selectAssociation(featureid);
	}
	
	public String selectFeatureType(int featureid) {
		return fDao.selectFeatureType(featureid);
	}
	
	public int selectFeatureHref(int featureid) {
		return fDao.selectFeatureHref(featureid);
	}
}