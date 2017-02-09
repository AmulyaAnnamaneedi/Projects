myApp.service('HeaderService',function($http,$q){
	return{
		
		getAccountData:function(){
			
			return $http.get('get_AccountData').then(function(response){
				
				if(typeof response.data=='object'){
				return response.data;
				
				}else{
					return $q.reject(response.data);
				}
					
			},function(response){
				//something gone wrong
				return $q.reject(response.data);
				
			})
		}
	}
});