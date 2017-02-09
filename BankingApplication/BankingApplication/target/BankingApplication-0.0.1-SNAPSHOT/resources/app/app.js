/**
 * 
 */
'use strict';
 
var App = angular.module('myApp',['ngroute']);
 
App.config(['$routeProvider', function($routeProvider){
     
	 $routeProvider
     .when('/contact', {
         templateUrl: 'AddReceipients.Html',
         
        
     })
    .when('/home', {
         templateUrl: 'Account.Html',
         controller : "AccountCtrl"
        
     })
     .when('/transfer', {
         templateUrl: 'Transfer.Html',
         controller : "TransferCtrl"
        
     })
        $urlRouterProvider.otherwise('/login')
}])
App.controller("HeaderCtrl", function ($scope,HeaderService) {
    $scope.appDetails= {};
    $scope.appDetails.title="Bank Application";
    $scope.appDetails.tagline="Welcome User!!"   
});
 myApp.controller("AccountCtrl",function($scope,HeaderService){
	 HeaderService.getAccountData().then(function(data){
		 var j=data;
		 
	 });
	 $scope.message"this is accounts page";
 });
 myApp.controller("AddrecipientCtrl",function($scope){
	 $scope.message="this is recipients page"; 
 });
myApp.controller("TransferCtrl",function($scope){
	$scope.message="this is transfer page";
}













    
