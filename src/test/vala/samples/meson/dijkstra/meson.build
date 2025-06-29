project('dijkstras-algorithm', 'vala', 'c',
        version: '0.0.1', 
        license: 'MIT', 
        default_options : [] )

deps = [
    dependency('gee-0.8')
]

source_files = files (
    [
        'graph.vala',
        'weighted_graph.vala',
        'vertex.vala',
        'edge.vala',
        'dijkstras_shortest_path.vala',
        'sample_weighted_graph_letters.vala'
    ]
)

graph_program = executable(
    'dijkstras-algorithm',
    dependencies: deps,
    sources: source_files,
    install: true
)