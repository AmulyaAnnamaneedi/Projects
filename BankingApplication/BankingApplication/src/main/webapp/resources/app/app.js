/**
 * 
 */
var App = angular.module('myApp',['ngroute']);
 
App.config(['$routeProvider', function($routeProvider){
     
	 $routeProvider
	 .when('/AddRecipients', {
         templateUrl: 'resources/pages/AddReceipients.html',
         controller:"AddrecipientCtrl"
         })
    .when('/account', {
         templateUrl: 'resources/pages/Account.html',
         controller : "AccountCtrl"
        
     })
     .when('/transfer', {
         templateUrl: 'resources/pages/Transfer.html',
         controller : "TransferCtrl"
        
     })
     .otherwise({
    	 templateUrl: 'home.html',
         controller : "defaultController"
     });
}]);

 App.controller("AccountCtrl",function($scope){
	 $scope.message"this is accounts page";
 });
 App.controller("AddrecipientCtrl",function($scope){
	 $scope.message="this is recipients page"; 
 });
App.controller("TransferCtrl",function($scope){
	$scope.message="this is transfer page";
});
App.controller("defaultController",function($scope){
	$scope.message="this is Home page";
});