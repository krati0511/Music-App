var tracks = [];

for(var i=0; i<track_list.length; i++) {
  tracks[i] = {
	name: track_list[i].name,
	previewURL: track_list[i].previewURL
  }
}

var track_names = [];

for(var i=0; i<tracks.length; i++) {
  track_names.push(tracks[i].name)
}