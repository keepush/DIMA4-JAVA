package fitness.service;

import java.util.ArrayList;
import java.util.List;

import fitness.vo.Fitness;

public class FitnessServiceimpl implements FitnessService{
	List<Fitness> list = new ArrayList<>();
	
	/**
	 * 전달받은 회원을 리스트에 저장
	 * @param fitness
	 * @return 등록 성공시 true, 아니면 false 반환
	 */
	
	public boolean insert(Fitness fitness) {
		return list.add(fitness);
	}
	
	public Fitness selectOne(int id) {
		for(int i=0; i<list.size();++i) {
			if(list.get(i).getId() == id)
				return list.get(i);
		}
		return null;
	}
	
	public boolean update(Fitness fitness) {
		for(int i=0; i<list.size();++i) {
			if(list.get(i).getId() == fitness.getId()) {
				list.get(i).setWeight(fitness.getWeight());
				list.get(i).setHeight(fitness.getHeight());
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 전달받은 id에 해당하는 회원의 정보를 찾아서 배열 내에서 삭제
	 * @param id
	 * @return 삭제가 완료되면 true, 회원id가 없어서 삭제를 못한 경우 false
	 */
	
	public boolean delete(int id) {
		for(int i=1; i<list.size(); ++i) {
			if(list.get(i).getId() == id) {
				list.remove(i);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 모든 회원의 정보를 반환
	 * @return
	 */
	public List<Fitness> selectAll(){
		return list;
	}
	
	public int getCount() {
		return list.size();
	}
}

