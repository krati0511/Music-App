var artist_id
artist_name = artist_name.toLowerCase()

for(var i=0; i<top_10_artists.length; i++) {
  if(top_10_artists[i].name.toLowerCase() == artist_name) {
    artist_id = top_10_artists[i].id
    break
  }
  
}