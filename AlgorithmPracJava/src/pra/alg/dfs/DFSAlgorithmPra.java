package pra.alg.dfs;

public class DFSAlgorithmPra {
	
	int[] numberArray = {1,2,4,7};
	int number = 4;
	int expectedSum = 13;
	
	public boolean doDFS(int index, int sum){
		boolean result = false;
		if(index == number){
			result  = (sum == expectedSum);
			return result;
		}
		
		if(doDFS(index+1, sum)){
			return true;
		}
		
		if(doDFS(index + 1, sum + numberArray[index])){
			return true;
		}
		
		return false;
		
	}
	
	public void solve(){
		
		if(doDFS(0,0)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}

}
