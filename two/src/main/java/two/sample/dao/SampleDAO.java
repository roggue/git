package two.sample.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import two.common.dao.AbstractDAO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO{
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardList(Map<String, Object> map) throws Exception{
		// TODO Auto-generated method stub
		return (Map<String, Object>) selectPagingList("sample.selectBoardList", map);
	}
}
