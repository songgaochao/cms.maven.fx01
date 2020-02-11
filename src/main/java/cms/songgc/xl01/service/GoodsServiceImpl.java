package cms.songgc.xl01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cms.songgc.xl01.dao.GoodsDao;
import cms.songgc.xl01.entity.Goods;

@Service
public class GoodsServiceImpl implements GoodsService{
	@Autowired
	private GoodsDao goodsDao;

	@Override
	public List<Goods> select() {
		// TODO Auto-generated method stub
		return goodsDao.select();
	}
	
}
