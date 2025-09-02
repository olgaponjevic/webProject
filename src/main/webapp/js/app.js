
const router = new VueRouter({
	mode: 'hash',
	routes: [
		{ path: '/', name: 'home', component: RentACarObjects }
		
	]
});

var app = new Vue({
	router,
	el: '#objects'
});