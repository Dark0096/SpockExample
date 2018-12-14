package com.dark.spockexample.closure;

import java.util.concurrent.atomic.AtomicLong;

public class Coupang {

	private static final long INITIAL_VALUE = 0;

	private AtomicLong pencilOrderCounter = new AtomicLong(INITIAL_VALUE);
	private AtomicLong paperOrderCounter = new AtomicLong(INITIAL_VALUE);
	private AtomicLong notebookOrderCounter = new AtomicLong(INITIAL_VALUE);
	private AtomicLong unknownOrderCounter = new AtomicLong(INITIAL_VALUE);

	public void order(Product product) {
		switch (product) {
			case PENCIL:
				pencilOrderCounter.incrementAndGet();
				return;
			case PAPER:
				paperOrderCounter.incrementAndGet();
				return;
			case NOTEBOOK:
				notebookOrderCounter.incrementAndGet();
				return;
			default:
				unknownOrderCounter.incrementAndGet();
				return;
		}
	}

	public long getPencilOrderCount() {
		return pencilOrderCounter.get();
	}

	public long getPaperOrderCount() {
		return paperOrderCounter.get();
	}

	public long getNotebookOrderCount() {
		return notebookOrderCounter.get();
	}

	public long getUnknownOrderCount() {
		return unknownOrderCounter.get();
	}
}