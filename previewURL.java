var previewURL
track_name = track_name.toLowerCase()

for(i=0; i<tracks.length; i++) {
  
  name = tracks[i].name.toLowerCase()
  if(name == track_name) {
    previewURL = tracks[i].previewURL
    break
  }
}