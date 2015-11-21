var sys = arbor.ParticleSystem(1000, 400, 1);
sys.parameters({
	gravity : true
});
sys.renderer = Renderer("#viewport");
var A = sys.addNode('A', {
	'color' : 'red',
	'shape' : 'dot',
	'label' : 'A'
});
var B = sys.addNode('B', {
	'color' : 'red',
	'shape' : 'dot',
	'label' : 'B'
});
var C = sys.addNode('C', {
	'color' : 'red',
	'shape' : 'dot',
	'label' : 'C'
});
var D = sys.addNode('D', {
	'color' : 'red',
	'shape' : 'dot',
	'label' : 'D'
});
var E = sys.addNode('E', {
	'color' : 'red',
	'shape' : 'dot',
	'label' : 'E'
});
sys.addEdge('A', 'B', {
	'color' : 'blue',
	'weight' : 1
});
sys.addEdge('A', 'C', {
	'color' : 'blue',
	'weight' : 1
});
sys.addEdge('B', 'A', {
	'color' : 'blue',
	'weight' : 1
});
sys.addEdge('B', 'C', {
	'color' : 'blue',
	'weight' : 1
});
sys.addEdge('C', 'A', {
	'color' : 'blue',
	'weight' : 1
});
sys.addEdge('C', 'B', {
	'color' : 'blue',
	'weight' : 1
});
sys.addEdge('C', 'D', {
	'color' : 'blue',
	'weight' : 1
});
sys.addEdge('D', 'C', {
	'color' : 'blue',
	'weight' : 1
});
sys.addEdge('D', 'E', {
	'color' : 'blue',
	'weight' : 1
});
sys.addEdge('E', 'D', {'color' : 'blue','weight' : 1});


