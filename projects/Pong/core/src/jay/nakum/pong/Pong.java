package jay.nakum.pong;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

public class Pong extends ApplicationAdapter {
	
	int height, width;
	
	ShapeRenderer shapeRenderer;
	SpriteBatch batch;
	
	OrthographicCamera camera;
	
	Texture ball;
	Texture pad;
	
	Vector2 ballPosition;
	Vector2 ballVelocity;
	
	Music background;
	Sound hit;
	Sound gameOver;
	
	boolean isPlaying;
	int score;

	@Override
	public void create () {

		shapeRenderer = new ShapeRenderer();
		batch = new SpriteBatch();

		camera = new OrthographicCamera();
		height = Gdx.graphics.getHeight();
		width = Gdx.graphics.getWidth();
		camera.setToOrtho(false, width, height);
		
		ball = new Texture("images/ball.png");
		pad = new Texture("images/pad.png");
		
		
		background = Gdx.audio.newMusic(Gdx.files.internal("audio/background1.mp3"));
		background.setLooping(true);
		
		background.play();
		
		hit = Gdx.audio.newSound(Gdx.files.internal("audio/ballHit.wav"));
		gameOver = Gdx.audio.newSound(Gdx.files.internal("audio/gameOver1.wav"));

		resetGame();
	}

	private void resetGame() {
		isPlaying = false;
		score = 0;
	}

	private void initGame() {
		camera.update();
		// batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.draw(pad, 10, 10);
		batch.draw(ball, (height / 2), (width / 2));
		batch.end();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		

		initGame();
	}
	
	@Override
	public void dispose () {
		gameOver.dispose();
		hit.dispose();
		background.dispose();
		pad.dispose();
		ball.dispose();
		batch.dispose();
		shapeRenderer.dispose();
	}
}
