/*
25. Media Player 
Scenario: A media player can play both Audio and Video files. 
Problem Statement: 
● Interface AudioPlayer → method playAudio(String song) 
● Interface VideoPlayer → method playVideo(String movie) 
● Class MediaPlayer implements both → provides implementation for both methods 
Sample Input: 
Audio → song="Shape of You" 
Video → movie="Inception" 
Sample Output: 
Playing Audio: Shape of You 
Playing Video: Inception 
*/
interface AudioPlayer{
	void playAudio(String song);
}
interface VideoPlayer{
	void playVideo(String movie);
}

class MediaPlayer implements AudioPlayer, VideoPlayer{
	 
	@Override
	public void playAudio(String track){
		System.out.println(track + ":playing audio");
	}
	public void playVideo(String movie){
		System.out.println(movie + ": playing video");
	}
}
public class MediaPlayerQ25{
	public static void main(String[] args){
		AudioPlayer  ap = new MediaPlayer();
		VideoPlayer vp = new MediaPlayer();

ap.playAudio("Shape of You");
vp.playVideo("Inception");
	}
}	
	
	