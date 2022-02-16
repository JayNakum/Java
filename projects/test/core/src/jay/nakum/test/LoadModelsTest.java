package jay.nakum.test;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
// import com.badlogic.gdx.assets.loaders.ModelLoader;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;
// import com.badlogic.gdx.graphics.g3d.loader.ObjLoader;
import com.badlogic.gdx.graphics.g3d.utils.CameraInputController;
import com.badlogic.gdx.utils.Array;

public class LoadModelsTest implements ApplicationListener {

	PerspectiveCamera cam;
	CameraInputController camController;

	ModelBatch modelBatch;
	AssetManager assets;
	Array<ModelInstance> instances = new Array<ModelInstance>();
	// Model model;
	// ModelInstance instance;
	Environment environment;
	boolean isLoading;

	@Override
	public void create() {
		modelBatch = new ModelBatch();
		environment = new Environment();
		environment.set(new ColorAttribute(ColorAttribute.AmbientLight, 0.4f, 0.4f, 0.4f, 1f));
		environment.add(new DirectionalLight().set(0.8f, 0.8f, 0.8f, -1f, -0.8f, 0.2f));
		
		cam = new PerspectiveCamera(67, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		cam.position.set(10f, 10f, 10f);
		cam.lookAt(0, 0, 0);
		cam.near = 1f;
		cam.far = 300f;
		cam.update();

		camController = new CameraInputController(cam);
		Gdx.input.setInputProcessor(camController);

		// ModelLoader<ObjLoader.ObjLoaderParameters> loader = new ObjLoader();
		// model = loader.loadModel(Gdx.files.internal("plane/piper_pa18.obj"));
		// instance = new ModelInstance(model);

		// assets = new AssetManager();
		// assets.load("plane/piper_pa18.obj", Model.class);

		assets = new AssetManager();
		assets.load("shark/Shark_Expand.obj", Model.class);
		isLoading = true;
	}

	private void doneLoading() {
		// Model plane = assets.get("plane/piper_pa18.obj", Model.class);
		// ModelInstance planeInstance = new ModelInstance(plane);
		// instances.add(planeInstance);

		Model shark = assets.get("shark/Shark_Expand.obj", Model.class);
		ModelInstance sharkInstance = new ModelInstance(shark);
		// // sharkInstance.transform.setToTranslation(-5f, 0, -5f);
		instances.add(sharkInstance);

		isLoading = false;
	}

	@Override
	public void render() {

		if(isLoading && assets.update()) {
			doneLoading();
		}

		camController.update();
		Gdx.gl.glViewport(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);

		modelBatch.begin(cam);
		modelBatch.render(instances, environment);
		modelBatch.end();
	}

	@Override
	public void dispose() {
		modelBatch.dispose();
		// model.dispose();
		instances.clear();
		assets.dispose();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

}